package practise;

public class arraysum {
	
	public static void main(String[] args) {
		

		int s[]= {1,2,3,4,5};

		        for(int i=0;i<s.length;i++)

		        {

		            for(int j=i+1;j<s.length;j++)

		            {

		                if(s[i]!=s[j])

		                {

		                    if(s[i]+s[j]==8)

		                    {

		                        System.out.println(s[i]+"+"+s[j]+"="+8);

		                    }

		 

		                    for(int k=j+1;k<s.length;k++)

		                    {

		                        if(s[j]!=s[k])

		                        {

		                            if(s[i]+s[j]+s[k]==8)

		                            {

		                                System.out.println(s[i]+"+"+s[j]+"+"+s[k]+"="+8);

		                            }

		                        }

		                    }

		                }

		            }

		        }

	}

}
