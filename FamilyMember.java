import java.util.*;

public class FamilyMember{
    public string xing;
    private string ming;
    static string familyxing;

    FamilyMember(string xing,string ming)
    {
        this.xing=xing;
        this.ming=ming;
    }
    public static void main(String args[]){
       System.out.println("����������գ�")��
       Scanner reader=new Scanner(System.in);
       FamilyMember.familyxing=reader.nextLine();
       int sum=0;
       System.out.println("��������Ա������")��
       int n=reader.nextInt();
       for(int j=0;j<n;j++)
       {
           System.out.println("�������Ա"+(j+1)+"������");
           FamilyMember m=new FamilyMember(reader.nextLine(),reader.nextLine());
           if(m.xing==FamilyMember.familyxing)
           {
               sum++;
           }
       }
       System.out.println("�ü��干��"+sum+"����Ա");
    }

}
