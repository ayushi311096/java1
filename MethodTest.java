class MethodTest
{
   int a;
   static int b;
   

   int m1(int a)  //instance method
   {
       System.out.println(this.a);
       System.out.println(a);
       System.out.println(b);
       return 34;
   }
   static void m2()  //static method
   {
         //System.out.println(a);
         System.out.println(b);
   }
   
   public static void main(String ar[])
   {
   
        MethodTest mt=new MethodTest();
        mt.a=10;
        int k=mt.m1(89);
        System.out.println(k);
        MethodTest.m2();
   }
    

}




