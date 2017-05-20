package jena;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

import org.apache.spark.sql.execution.QueryExecution;

import com.hp.hpl.jena.graph.query.Query;
import com.hp.hpl.jena.query.QueryExecutionFactory;
import com.hp.hpl.jena.query.QueryFactory;
import com.hp.hpl.jena.query.ResultSet;
import com.hp.hpl.jena.query.ResultSetFormatter;
import com.hp.hpl.jena.rdf.model.Model;
import com.hp.hpl.jena.rdf.model.ModelFactory;


public class Condition {

	public void readOntology() throws IOException
	{
		InputStream in = new FileInputStream(new File("/home/andra/Git/spark/Data/ConfigurataBine.owl"));
		Model model = ModelFactory.createMemModelMaker().createDefaultModel();
		model.read(in,null);
		in.close();
		
		// Create a new query
		String queryString = "PREFIX owl: <http://www.w3.org/2002/07/owl#> SELECT ?Plant ";
		 
		
	}
	
}
