package study;
import java.util.*;
import java.io.*;
public class CSX_358_HW2_16103065 {

	public static void main(String[] args)throws Exception {
		// TODO Auto-generated method stub
		File f1=new File("/home/rohan/Downloads/java assignments/csx-351-hw2-Rohandutt22-master//HW2-dictionary.txt");
		File f2= new File("/home/rohan/Downloads/java assignments/csx-351-hw2-Rohandutt22-master//HW2-keywords.txt");
        File f3=new File("/home/rohan/Downloads/java assignments/csx-351-hw2-Rohandutt22-master//HW2-OUTPUT-16103065.txt");
        FileWriter fw= new FileWriter(f3);
       
		Scanner s1=new Scanner(f1);
      Scanner s2=new Scanner(f2);
      String dct[]=new String[16000];
      String kwd[]=new String[84];
      int i,j,k,l,mid,p,counter=0;
      i=0;
      j=0;
      while(s1.hasNextLine())
      {
    	  dct[i]=s1.nextLine();// to imput in a string array
    	  i++;
      }
      while(s2.hasNextLine())
      {
    	  kwd[j]=s2.nextLine();// to imput in a string array
    	  j++;
      }
      for(k=1;k<i;k++)
      {
    	  for(l=0;l<i-k;l++)
    	  {                            // sorting the strings.
    		  if(dct[l+1].compareTo(dct[l])>0)
    		  {
    			  String g=dct[l+1];
    			  dct[l+1]=dct[l];
    			  dct[l]=g;
    		  }
    	  }
      }
      for(k=1;k<j;k++)
      {
    	  for(l=0;l<j-k;l++) // sorting the strings
    	  {
    		  if(kwd[l+1].compareTo(kwd[l])>0)
    		  {
    			  String g=kwd[l+1];
    			  kwd[l+1]=kwd[l];
    			  kwd[l]=g;
    		  }
    	  }
      }
      for(k=0;k<j;k++)
      {
    	  l=0;
    	  p=i-1;
    	  int flag=0;
    	  while(l<=p)
    	  {
    		  mid=(l+p)/2;// binary search.
    		  if(kwd[k].compareTo(dct[mid])==0)
    		  {
    			  flag=1;
    			  break;
    		  }
    		  else if(kwd[k].compareTo(dct[mid])>0)
    		  {
    			  p=mid-1;
    		  }
    		  else
    			  l=mid+1;
    	  }
    	  if(flag==0)
    	  {
    		  counter++;
    		  String r="keyword not found:"+kwd[k]+"\n";
    		  fw.write(r);
    		  System.out.println(r);
    	  }
    	  
      }
      System.out.print("Number of keywords not found = "+counter);
      fw.write("Number of keywords not found = "+counter);
      fw.close();
      s1.close();
      s2.close();
	}

}
 