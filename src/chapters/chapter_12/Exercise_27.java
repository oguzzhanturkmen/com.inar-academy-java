package chapters.chapter_12;

import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;

public class Exercise_27 {
        public static void main(String[] args) {
            if (args.length != 1) {
                System.out.println("Wrong usage !!!");
                System.exit(1);
            }
            ArrayList<File> files = new ArrayList<>();
            files.add(new File(args[0]));

            while(!files.isEmpty()){
                if(files.get(0).isDirectory()){
                    files.addAll(Arrays.asList(files.get(0).listFiles()));
                    files.remove(0);
                }
                else{
                    changeName(files.get(0));
                    files.remove(0);
                }

            }
            System.out.println("Finished");
        }
        public static void changeName(File file){
            String str1 = file.getName();
            if(str1.matches("Exercise\\d_\\d.java")){
                String str2 ="";
                for (int i = 0; i < str1.length(); i++) {
                    if(i == 8){
                        str2 += "0" + str1.charAt(i);
                    }
                    else if(i == 10){
                        str2 += "0" + str1.charAt(i);

                    }
                    else{
                        str2 += str1.charAt(i);
                    }
                }
                File newFile = new File(str2);
                file.renameTo(newFile);
            }
        }
    }

