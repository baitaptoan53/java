class Student 
{
                   string name,SurName,Birthdate,class;
                   Student(string name,string SurName,String Birthdate,string class)
                   {
                       this.name=name;
                       this.SurName=SurName;
                       this.Birthdate=Birthdate;
                       this.class=class;
                   }
                   public string getName()
                   {
                       return name;
                   }
                   public string getSurName()
                   {
                       return SurName;
                   }
                   public string getBirthdate()
                   {
                       return Birthdate;
                   }
                   public string getClass()
                   {
                       return class;
                   }
                   public void setName(string name)
                   {
                       this.name=name;
                   }
                   public void setSurName(string SurName)
                   {
                       this.SurName=SurName;
                   }
                   public void setBirthdate(string Birthdate)
                   {
                       this.Birthdate=Birthdate;
                   }
                   public void setClass(string class)
                   {
                       this.class=class;
                   }
                   public void print()
                   {
                       System.out.println("Name: "+name);
                       System.out.println("Surname: "+SurName);
                       System.out.println("Birthdate: "+Birthdate);
                       System.out.println("Class: "+class);
                   }

}