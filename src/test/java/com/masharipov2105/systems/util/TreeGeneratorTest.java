package com.masharipov2105.systems.util;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

import java.lang.Exception;
import java.net.URL;
import java.nio.file.Path;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.FileReader;

public class TreeGeneratorTest{

	private String fileResult() throws Exception, IOException{

		URL resource = getClass().getClassLoader().getResource("result.txt");
		Path sampleDir = Path.of(resource.toURI());

		File file = new File(sampleDir.toString());

		StringBuilder sb = new StringBuilder();

		BufferedReader br = new BufferedReader(new FileReader(file));

		String line;

		while((line = br.readLine()) != null){

			sb.append(line).append("\n");
		}

		return sb.toString().stripTrailing();
	}

	@Test
	void testGenerate() throws Exception, IOException{

		URL resource = getClass().getClassLoader().getResource("example-tree");
		Path sampleDir = Path.of(resource.toURI());

		String result = TreeGenerator.generate(sampleDir.toString(), false, 0);

		assertEquals(fileResult(), result);

	}
}