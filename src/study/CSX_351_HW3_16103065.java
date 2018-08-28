package study;
import java.util.*;
import java.io.*;
public class CSX_351_HW3_16103065 {

	public static void main(String[] args) throws Exception {
		File fin =new File("/home/rohan/Downloads/java assignments/csx-351-hw3-Rohandutt22-master//HW3-unsorted-keywords.txt");
		File f3=new File("/home/rohan/Downloads/java assignments/csx-351-hw3-Rohandutt22-master//HW3-OUTPUT-16103065.txt");
		FileWriter fw= new FileWriter(f3);
		File fc=new File("/home/rohan/Downloads/java assignments/csx-351-hw3-Rohandutt22-master//HW3-input-code.cpp");
		Scanner s= new Scanner(fin);
		Scanner s2= new Scanner(fc);
		int i=0;
		while(s.hasNextLine())
		{
			String d=s.nextLine();  // to count the no. of the keywords.
			if(d.length()>0)
				i++;
		
		}
		int counter=0;
		//System.out.print(i);
        String a[]=new String[i];
        int j=-1;
        s.close();
        s= new Scanner(fin);
        while(s.hasNextLine())
		{
			String d=s.nextLine();  // to count the no. of the keywords.
			if(d.length()>0)
			{
				j++;
				a[j]=d;
			}
		
		}
        j++;
        int k,l;
        for(k=1;k<j;k++)
        {
      	  for(l=0;l<j-k;l++) // sorting the strings
      	  {
      		  if(a[l+1].compareTo(a[l])>0)
      		  {
      			  String g=a[l+1];
      			  a[l+1]=a[l];
      			  a[l]=g;
      		  }
      	  }
        }
        String g;
        i=0;
        while(s2.hasNextLine())
		{
        	i++;
        	int flag=0;
		g=s2.nextLine();
	
		String x="line "+i+": ";
		for(k=0;k<g.length();k++)
		der:{int r=k;
			char w=g.charAt(k);
			
			if(w>=97&&w<=122||w>=48&&w<=57||w=='_')
			{
				String q="";
				while(w>=97&&w<=122||w>=48&&w<=57||w=='_')
				{
					q=q+w;
				k++;
				if(k<g.length())
				w=g.charAt(k);
				else
					w='&';
				}k=k-1;
				int y,u,h;
				y=0;
				u=j-1;
				while(y<=u)
				{
					h=(y+u)/2;
					if(q.compareTo(a[h])==0)
					{
						flag=1;
						counter++;
						x=x+q+"("+r+") ";
						break;
					}
					else if(q.compareTo(a[h])>0)
					u=h-1;	
					else
                    y=h+1;						
				}
			}
			else
			{
				if(w=='/')
				{
					k++;
					w=g.charAt(k);
					if(w=='/')
					{
						break der;
					}
					else
						k=k-1;
				}
			}
		}
		if(flag==1)
		{
			x=x+"\n";
			fw.write(x);
			System.out.print(x);
		}
		}
		
        String f="Number of keywords found : "+counter+"\n";
        System.out.print(f);
        fw.write(f);
        s.close();
        s2.close();
        fw.close();}
   
}
