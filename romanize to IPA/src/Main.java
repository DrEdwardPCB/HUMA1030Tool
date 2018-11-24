import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		System.setProperty("file.encoding", "UTF-8");
		System.out.println("Started conversion");
		BufferedWriter pw=null;
		Scanner sc =null;
		try {
			if(!new File("out.txt").exists()) {
				new File("out.txt").createNewFile();
			}
			pw=new BufferedWriter (new OutputStreamWriter(new FileOutputStream("out.txt"),"UTF-8"));
			sc=new Scanner(new File("in.txt"));
			pw.write("*/readme");
			pw.newLine();
			pw.write("*please apply the following method in excel to retrieve individual initials");
			pw.newLine();
			pw.write("*replace\"kʰw/kw=\" with kʰw and kw");
			pw.newLine();
			pw.write("*replace\"tsʰ/ts=\" with tsʰ and ts");
			pw.newLine();
			pw.write("*replace\"tʃʰ/tʃ=\" with tʃʰ and tʃ");
			pw.newLine();
			pw.write("*replace\"pʰ/p=\" with pʰ and p");
			pw.newLine();
			pw.write("*replace\"tʰ/t=\" with tʰ and t");
			pw.newLine();
			pw.write("*replace\"kʰ/k=\" with kʰ and k");
			pw.newLine();
			pw.write("for endings just choose the 1 you want in case there are multiple");
			pw.newLine();
			pw.write("*replace\"i/ɛi=\" with i and ɛi");
			pw.newLine();
			pw.write("*replace\"ai/ɐi/ɛi=\" with ai and ɐi and ɛi");
			pw.newLine();
			pw.write("*replace\"au/ɐu=\" with au and ɐu");
			pw.newLine();
			pw.write("*replace\"ɛi/ui=\" with ɛi and ui");
			pw.newLine();
			pw.write("*replace\"a/ɐ=\" with a and ɐ");
			pw.newLine();
			pw.write("*replace\"ɐ/ɔ/ou=\" with ɐ and ɔ and ou");
			pw.newLine();
			pw.write("*replace\"i/ɛ=\" with i and ɛ");
			pw.newLine();
			pw.write("*replace\"ɐ/u/ɵ/y=\" with ɐ and u and ɵ and y");
			pw.newLine();
			pw.write("*/");
			pw.newLine();
			while(sc.hasNext()) {
				String EnglishWord=sc.nextLine();
				String[] splitted=EnglishWord.split(" ");
				//pw.write(EnglishWord+" : ");
				for(int i=0;i<splitted.length;i++) {
					String output="";
					//ignore street and road
					if(splitted[i].equalsIgnoreCase("road")==splitted[i].equalsIgnoreCase("lane")==splitted[i].equalsIgnoreCase("path")==splitted[i].equalsIgnoreCase("street")==splitted[i].equalsIgnoreCase("avenue")) {
						//System.out.println(splitted[i]);
						pw.write(splitted[i]);
						continue;
					}
					//initial conversion
					//substring inclusive first exclusive end
					String temp=new String(splitted[i]);
					String initial2="";
					if(temp.length()>1) {
						initial2=temp.substring(0, 2);
						if(initial2.equalsIgnoreCase("kw")) {
							output+="kʰw/kw=";
							temp=temp.replaceFirst("(?i)kw", "");
						}
						if(initial2.equalsIgnoreCase("ng")) {
							output+="ŋ=";
							temp=temp.replaceFirst("(?i)ng", "");
						}
						if(initial2.equalsIgnoreCase("ts")) {
							output+="tsʰ/ts=";
							temp=temp.replaceFirst("(?i)ts", "");
						}
						if(initial2.equalsIgnoreCase("sh")) {
							output+="ʃ=";
							temp=temp.replaceFirst("(?i)sh", "");
						}
						if(initial2.equalsIgnoreCase("ch")) {
							output+="tʃʰ/tʃ=";
							temp=temp.replaceFirst("(?i)ch", "");
						}
					}
					String initial1=temp.substring(0, 1);
					if(initial1.equalsIgnoreCase("p")) {
						output+="pʰ/p=";
						temp=temp.replaceFirst("(?i)p", "");
					}
					if(initial1.equalsIgnoreCase("t")&&!initial2.equalsIgnoreCase("ts")) {
						output+="tʰ/t=";
						temp=temp.replaceFirst("(?i)t", "");
					}
					if(initial1.equalsIgnoreCase("k")&&!initial2.equalsIgnoreCase("kw")) {
						output+="kʰ/k=";
						temp=temp.replaceFirst("(?i)k", "");
					}
					if(initial1.equalsIgnoreCase("m")) {
						output+="m=";
						temp=temp.replaceFirst("(?i)m", "");
					}
					if(initial1.equalsIgnoreCase("n")&&!initial2.equalsIgnoreCase("ng")) {
						output+="n=";
						temp=temp.replaceFirst("(?i)n", "");
					}
					if(initial1.equalsIgnoreCase("l")) {
						output+="l=";
						temp=temp.replaceFirst("(?i)l", "");
					}
					if(initial1.equalsIgnoreCase("f")) {
						output+="f=";
						temp=temp.replaceFirst("(?i)f", "");
					}
					if(initial1.equalsIgnoreCase("s")&&!initial2.equalsIgnoreCase("sh")) {
						output+="s=";
						temp=temp.replaceFirst("(?i)s", "");
					}
					if(initial1.equalsIgnoreCase("h")) {
						output+="h=";
						temp=temp.replaceFirst("(?i)h", "");
					}
					if(initial1.equalsIgnoreCase("y")) {
						output+="j=";
						temp=temp.replaceFirst("(?i)y", "");
					}
					if(initial1.equalsIgnoreCase("w")) {
						output+="w=";
						temp=temp.replaceFirst("(?i)w", "");
					}
					//System.out.println(output+" "+temp);
					//vowel conversion
					String vowel2="";
					if(temp.length()>1) {
						vowel2=temp.substring(0, 2);
						if(vowel2.equalsIgnoreCase("ah")) {
							output+="a=";
							temp=temp.replaceFirst("(?i)ah", "");
						}
						if(vowel2.equalsIgnoreCase("ze")) {
							output+="i=";
							temp=temp.replaceFirst("(?i)ze", "");
						}
						if(vowel2.equalsIgnoreCase("ee")) {
							output+="i/ɛi=";
							temp=temp.replaceFirst("(?i)ee", "");
						}
						if(vowel2.equalsIgnoreCase("oo")) {
							output+="u=";
							temp=temp.replaceFirst("(?i)oo", "");
						}
						if(vowel2.equalsIgnoreCase("eu")) {
							output+="œ=";
							temp=temp.replaceFirst("(?i)eu", "");
						}
						if(vowel2.equalsIgnoreCase("eo")) {
							output+="œ=";
							temp=temp.replaceFirst("(?i)eo", "");
						}
						if(vowel2.equalsIgnoreCase("yu")) {
							output+="y=";
							temp=temp.replaceFirst("(?i)yu", "");
						}
						if(vowel2.equalsIgnoreCase("ue")) {
							output+="y=";
							temp=temp.replaceFirst("(?i)ue", "");
						}
						if(vowel2.equalsIgnoreCase("ai")) {
							output+="ai/ɐi/ɛi=";
							temp=temp.replaceFirst("(?i)ai", "");
						}
						if(vowel2.equalsIgnoreCase("au")) {
							output+="au/ɐu=";
							temp=temp.replaceFirst("(?i)au", "");
						}
						if(vowel2.equalsIgnoreCase("ei")) {
							output+="ɛi=";
							temp=temp.replaceFirst("(?i)ei", "");
						}
						if(vowel2.equalsIgnoreCase("ay")) {
							output+="ɛi=";
							temp=temp.replaceFirst("(?i)ay", "");
						}
						if(vowel2.equalsIgnoreCase("iu")) {
							output+="iu=";
							temp=temp.replaceFirst("(?i)iu", "");
						}
						if(vowel2.equalsIgnoreCase("oi")) {
							output+="ɔi=";
							temp=temp.replaceFirst("(?i)oi", "");
						}
						if(vowel2.equalsIgnoreCase("oy")) {
							output+="ɔi=";
							temp=temp.replaceFirst("(?i)oy", "");
						}
						if(vowel2.equalsIgnoreCase("ui")) {
							output+="ɛi/ui=";
							temp=temp.replaceFirst("(?i)ui", "");
						}
						
					}
					if(temp.length()!=0) {
						String vowel1=temp.substring(0, 1);
						if(vowel1.equalsIgnoreCase("a")) {
							output+="a/ɐ=";
							temp=temp.replaceFirst("(?i)a", "");
						}
						if(vowel1.equalsIgnoreCase("o")) {
							output+="ɐ/ɔ/ou=";
							temp=temp.replaceFirst("(?i)o", "");
						}
						if(vowel1.equalsIgnoreCase("i")) {
							output+="i/ɛ=";
							temp=temp.replaceFirst("(?i)i", "");
						}
						if(vowel1.equalsIgnoreCase("u")) {
							output+="ɐ/u/ɵ/y=";
							temp=temp.replaceFirst("(?i)u", "");
						}
						if(vowel1.equalsIgnoreCase("e")) {
							output+="ɛ=";
							temp=temp.replaceFirst("(?i)e", "");
						}
						if(vowel1.equalsIgnoreCase("z")) {
							output+="i=";
							temp=temp.replaceFirst("(?i)z", "");
						}
					}
					
				
					//finals conversion
					if(temp.length()>0) {
						if(temp.equalsIgnoreCase("ng")) {
							output+="ŋ";
							temp=temp.replaceFirst("(?i)ng", "");
						}
						else {
							output+=temp;
						}
					}
					//System.out.print(output+"  ");
					pw.write(output+"  ");
				}
				//System.out.println();
				pw.newLine();
				pw.flush();
			}
			pw.close();
			//Thread.sleep(5000);
			anotherConversion();
			
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			sc.close();
			try {
				pw.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}
	public static void anotherConversion() {
		BufferedWriter pw=null;
		Scanner sc =null;
		try {
			if(!new File("finalout.txt").exists()) {
				new File("finalout.txt").createNewFile();
			}
			pw=new BufferedWriter (new OutputStreamWriter(new FileOutputStream("finalout.txt"),"UTF-8"));
			sc=new Scanner(new BufferedReader(new InputStreamReader(new FileInputStream("out.txt"),"UTF-8")));
			pw.write("*/readme");
			pw.newLine();
			pw.write("inside each bracket are the combination of each word possible IPA without tone expression");
			pw.newLine();
			pw.write("*/");
			pw.newLine();
			boolean start=false;
			while(sc.hasNextLine()) {
				//pw.write("Edward");
				if(!start) {
					if(sc.nextLine().equals("*/")) {
						start=true;
					}
				}
				
				if(start) {
					String temp=sc.nextLine();
					String[] split=temp.split("  ");
					for(int i=0;i<split.length;i++) {
						ArrayList<String> out =new ArrayList<>();
						ArrayList<String> temp1 =new ArrayList<>();
						//System.out.print(split[i]+" ");
						if(split[i].contains("kʰw/kw=")) {
							temp1.add(split[i].replaceFirst("kʰw/kw=", "kʰw"));
							temp1.add(split[i].replaceFirst("kʰw/kw=", "kw"));
						}else
						if(split[i].contains("tsʰ/ts=")) {
							temp1.add(split[i].replaceFirst("tsʰ/ts=", "tsʰ"));
							temp1.add(split[i].replaceFirst("tsʰ/ts=", "ts"));
						}else
						if(split[i].contains("tʃʰ/tʃ=")) {
							temp1.add(split[i].replaceFirst("tʃʰ/tʃ=", "tʃʰ"));
							temp1.add(split[i].replaceFirst("tʃʰ/tʃ=", "tʃ"));
						}else
						if(split[i].contains("pʰ/p=")) {
							temp1.add(split[i].replaceFirst("pʰ/p=", "pʰ"));
							temp1.add(split[i].replaceFirst("pʰ/p=", "p"));
						}else
						if(split[i].contains("tʰ/t=")) {
							temp1.add(split[i].replaceFirst("tʰ/t=", "tʰ"));
							temp1.add(split[i].replaceFirst("tʰ/t=", "t"));
						}else
						if(split[i].contains("kʰ/k=")) {
							temp1.add(split[i].replaceFirst("kʰ/k=", "kʰ"));
							temp1.add(split[i].replaceFirst("kʰ/k=", "k"));
						}else {
							if(split[i].length() - split[i].replace("=", "").length()==2) {
								temp1.add(split[i].replaceFirst("=", ""));
							}else {
								temp1.add(split[i]);
							}
						}
						//System.out.println(temp1.get(0));
						//processing finals
						for(String s: temp1) {
							//System.out.println(s);
							if(s.contains("ɐ/u/ɵ/y=")) {
								out.add(s.replaceFirst("ɐ/u/ɵ/y=", "ɐ"));
								out.add(s.replaceFirst("ɐ/u/ɵ/y=", "u"));
								out.add(s.replaceFirst("ɐ/u/ɵ/y=", "ɵ"));
								out.add(s.replaceFirst("ɐ/u/ɵ/y=", "y"));
							}else if(s.contains("ɐ/ɔ/ou=")) {
								out.add(s.replaceFirst("ɐ/ɔ/ou=", "ɐ"));
								out.add(s.replaceFirst("ɐ/ɔ/ou=", "ɔ"));
								out.add(s.replaceFirst("ɐ/ɔ/ou=", "ou"));
							}else if(s.contains("ai/ɐi/ɛi=")) {
								out.add(s.replaceFirst("ai/ɐi/ɛi=", "ai"));
								out.add(s.replaceFirst("ai/ɐi/ɛi=", "ɐi"));
								out.add(s.replaceFirst("ai/ɐi/ɛi=", "ɛi"));
							}else if(s.contains("i/ɛi=")) {
								out.add(s.replaceFirst("i/ɛi=", "i"));
								out.add(s.replaceFirst("i/ɛi=", "ɛi"));
							}else if(s.contains("au/ɐu=")) {
								out.add(s.replaceFirst("au/ɐu=", "au"));
								out.add(s.replaceFirst("au/ɐu=", "ɐu"));
		
							}else if(s.contains("ɛi/ui=")) {
								out.add(s.replaceFirst("ɛi/ui=", "ɛi"));
								out.add(s.replaceFirst("ɛi/ui=", "ui"));
		
							}else if(s.contains("a/ɐ=")) {
								out.add(s.replaceFirst("a/ɐ=", "a"));
								out.add(s.replaceFirst("a/ɐ=", "ɐ"));
		
							
							}else if(s.contains("i/ɛ=")) {
								out.add(s.replaceFirst("i/ɛ=", "i"));
								out.add(s.replaceFirst("i/ɛ=", "ɛ")); 
							}else{
								out.add(s.replaceFirst("=", ""));
							}
						}
						pw.write("(");
						for(String haha:out) {
							pw.write(haha+",");
						}
						pw.write(")  ");
					}
				pw.newLine();
				pw.flush();
				}
			}
			pw.flush();
			pw.close();
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			sc.close();
			try {
				pw.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
