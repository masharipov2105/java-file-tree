package com.masharipov2105.systems.util;

import java.util.ArrayList;
import java.io.File;

public final class TreeGenerator{

	private TreeGenerator(){

		throw new UnsupportedOperationException("Utility class cannot be instantiated!");
	}

	public static String generate(String path, boolean isChild, int level){

		String tabs = "";

        for (int i = 0; i < level; i ++){

            for (int j = 0; j < 4; j ++){

                tabs += " ";
            }
        }

        String finalResult = "";

        if (path == null || path.trim().isEmpty()){

            return "invalid path: path is null";
        }

	    File file = new File(path);

	    if (!file.exists()){

	        return "Invalid path: path is not exists";
        }

        if (file.isFile()){

            return "Invalid path: is not folder";
        }

        if (file == null){

            return "invalid file: file is null";
        }

        File[] mass = file.listFiles();

        ArrayList<File> mass2 = new ArrayList<>();

        for (File f : mass){

            if (!f.getName().startsWith(".")){

                mass2.add(f);
            }
        }


        if (!isChild){

            finalResult += (file.getName() + "/\n");
        }

        if (mass2.size() == 0 && !isChild){

            return file.getName() + "/";
        }

        for (int i = 0; i < mass2.size(); i ++){
            if ((mass2.size() - 1) == i){

                finalResult += "└── ";

                if (mass2.get(i).isFile()){

                    finalResult += mass2.get(i).getName() + "\n";
                } else{

                    finalResult += mass2.get(i).getName() + "/\n";

                    String rekursivResult = generate((path + "/" + mass2.get(i).getName()), true, (level + 1));
                    String[] lines = rekursivResult.split("\n");
                    int size_ = lines.length;

                    for (int k = 0; k < size_; k ++){

                        finalResult += ("    " + lines[k] + "\n");
                    }

                }
            } else{

                finalResult += "├── ";

                if (mass2.get(i).isFile()){

                    finalResult += mass2.get(i).getName() + "\n";
                } else{

                    finalResult += mass2.get(i).getName() + "/\n";
                    String rekursivResult = generate((path + "/" + mass2.get(i).getName()), true, (level + 1));
                    String[] lines = rekursivResult.split("\n");
                    int size_ = lines.length;

                    for (int k = 0; k < size_; k ++){

                        finalResult += ("│   " + lines[k] + "\n");
                    }
                }
            }
        }
        return finalResult.stripTrailing();
	}
}