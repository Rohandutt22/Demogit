package study;
import java.io.*;
import java.util.*;
public class CSX_358_HW1_16103065 {

	public static void main(String[] args)throws Exception {
		File f=new File("/home/rohan/Downloads//HW1-data.txt");
		Scanner s= new Scanner(f);
		String r;
		
        File f2=new File("/home/rohan/Desktop//HW1-OUTPUT-16103065.txt");
        FileWriter fw=new FileWriter(f2);
        r="stdnt_id Ex ------- Assignments --------- Tot Mi Fin CL Pts Pct Gr\n";
        fw.write(r);
        System.out.println(r);
        r="-------- -- ----------------------------- --- -- --- -- --- --- --\n";
        fw.write(r);
        System.out.println(r);
        int a,b,c,d,F,df=0,m=0,u=0;
        a=b=c=d=F=0;
        while(s.hasNextLine())
		{
        	df++;
			int i,j,h;
			int w[]=new int[18];
			i=0;
			String p="";
				w[i]=s.nextInt();
				h= String.valueOf(w[i]).length();
				if(h==8)
				p=p+(w[i]+" ");
				else
				{
					h=8-h;
					while(h-->0)
						p=p+(" ");
					p=p+(w[i]+" ");
					
				}
				i++;
			
			while(i<2)
			{
				w[i]=s.nextInt();
				h= String.valueOf(w[i]).length();
				if(h<2)
				{
					h=2-h;
					while(h-->0)
						p=p+(" ");	
				}
				p=p+(w[i]+" ");
				i++;
			}
			j=0;
			while(i<12)
			{
				w[i]=s.nextInt();
				h= String.valueOf(w[i]).length();
				if(h<2)
				{
					h=2-h;
					while(h-->0)
						p=p+(" ");	
				}
				p=p+(w[i]+" ");
						i++;
				
			}
			w[12]=0;
			for(j=2;j<12;j++)
			w[12]=w[12]+w[j];
			h= String.valueOf(w[i]).length();
			if(h<3)
			{
				h=3-h;
				while(h-->0)
					p=p+(" ");	
			}
			p=p+(w[i]+" ");
			i++;
			///12 khtm;
			w[i]=s.nextInt();
			h= String.valueOf(w[i]).length();
			if(h<2)
			{
				h=2-h;
				while(h-->0)
					p=p+(" ");	
			}
			p=p+(w[i]+" ");
				i++;
				//13 
				
				w[i]=s.nextInt();
				h= String.valueOf(w[i]).length();
				if(h<3)
				{
					h=3-h;
					while(h-->0)
						p=p+(" ");	
				}
				p=p+(w[i]+" ");
					i++;
				
			while(i<16)
			{
				w[i]=s.nextInt();
				h= String.valueOf(w[i]).length();
				if(h<2)
				{
					h=2-h;
					while(h-->0)
						p=p+(" ");	
				}
				p=p+(w[i]+" ");
					i++;
			}
			
			w[16]=w[1]+w[12]+w[13]+w[14]+w[15];
			h= String.valueOf(w[i]).length();
			if(h<3)
			{
				h=3-h;
				while(h-->0)
					p=p+(" ");	
			}
			p=p+(w[i]+" ");
				i++;
				float we;
	        we=(float)((float)(w[16]*100)/420);
	        w[17]=(int)(we);
	        if(we-w[17]>=0.5)
	        	w[17]=w[17]+1;
	        	//System.out.print(we+"j  "+w[17]+"  h");
	        m=m+w[17];
	        if(df==1)
	        	u=w[17];
	        else
	        {
	        	if(w[17]>u)
	        		u=w[17];
	        }
	        h= String.valueOf(w[i]).length();
			if(h<3)
			{
				h=3-h;
				while(h-->0)
					p=p+(" ");	
			}
			p=p+(w[i]+" ");
			j=w[17];
			if(j>=90)
				{
				a++;
				p=p+("A\n");
				}
			else if(j>=78)
				{
				b++;
				p=p+("B\n");
				}
			else if(j>=62)
				{
				c++;
				p=p+("C\n");
				}
			else if(j>=46)
				{
				d++;
				p=p+("D\n");
				}
			else 
				{
				F++;
				p=p+("F\n");
				}
			
			
			System.out.print(p);
			fw.write(p);
		}
        r="Average total point percent of all students: ";
        float q=(float)(m)/df;
        int vb=(int)(q);
        if(q-vb>=0.5)
        	vb=vb+1;
        r=r+(vb);
        r=r+"\n";
        fw.write(r);
    	System.out.print(r);
    	r="Number of A's ="+(a)+"\n";
    	fw.write(r);
    	System.out.print(r);
    	r="Number of B's ="+(b)+"\n";
    	fw.write(r);
    	System.out.print(r);
    	r="Number of C's ="+(c)+"\n";
    	fw.write(r);
    	System.out.print(r);
    	r="Number of D's ="+(d)+"\n";
    	fw.write(r);
    	System.out.print(r);
    	r="Number of F's ="+(F)+"\n";
    	fw.write(r);
    	System.out.print(r);
        r="Maximum points = "+(u)+"\n";
        fw.write(r);
    	System.out.print(r);
        
        fw.close();
	}

}
