package spark;

import java.io.IOException;

import org.apache.hadoop.conf.Configuration;
import org.apache.spark.SparkConf;
import org.apache.spark.streaming.Durations;
import org.apache.spark.streaming.api.java.JavaDStream;
import org.apache.spark.streaming.api.java.JavaPairDStream;
import org.apache.spark.streaming.api.java.JavaStreamingContext;

import jena.Condition;


public class ProcessDataJob {

	public static void main(String[] args) throws InterruptedException, IOException {
		
		System.out.println("Hello Spark!");

		SparkConf conf = new SparkConf().setAppName("spark").setMaster("local");
		JavaStreamingContext context = new JavaStreamingContext(conf, Durations.seconds(10));
		JavaDStream<String> linesDStream = context.textFileStream("/home/andra/workspace/spark/Data");
		linesDStream.print();

		JavaPairDStream<String, Long> x = linesDStream.countByValue();

		context.start();
		System.out.println("Running spark" + linesDStream.toString());

		context.awaitTermination();

	}

	private Sensor parseSensor(String s) {
		Sensor sensor = new Sensor();

		String[] p = s.split(",");

		sensor.setGreenHouseName(p[2].toString().trim());
		sensor.setIntTemperature(Double.parseDouble(p[8]));
		sensor.setExtTemperature(Double.parseDouble(p[3]));
		sensor.setIntMoisture(Double.parseDouble(p[11]));

		return sensor;
	}

}
