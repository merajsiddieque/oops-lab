#include<iostream>
#include<conio.h>
using namespace std;
class Employee
{

    private:
    string Ename,Designation,DateOfJoining,BasicPay,Deductions;
    int Ecode,AccountNumber;

    public:

    Employee()
    {
        cout<<"default constructor"<<endl;
    } 
   ~ Employee()
    {
        cout<<"default destructor"<<endl;
    } 
     
     Employee(string EName,string Designation,string DateOfJoining,string BasicPay,string Deductions,int Ecode,int AccountNumber)
     {
        this->Ename=Ename;
        this->Designation=Designation;
        this->DateOfJoining=DateOfJoining;
        this->BasicPay=BasicPay;
        this->Deductions=Deductions;
        this->Ecode=Ecode;
        this->AccountNumber=AccountNumber;
     }

     void show()
     {
        cout<<"EName=" <<Ename;
        cout<<" , Designation="<<Designation;
        cout<<" , DateOfJoining="<<DateOfJoining;
        cout<<" , BasicPay="<<BasicPay;
        cout<<" , Deductions="<<Deductions;
        cout<<" , Ecode="<<Ecode;
        cout<<" , AccountNumber="<<AccountNumber<<endl;
     }

};

int main()
{
    

    Employee m1("Meraj","ABC","22/01/2022","DA","PPF",20,615);
    m1.show();
    Employee m2("Mihir","CDE","22/01/2022","HRA","GPF",20,615);
    m2.show();
    Employee m3("Anshul","FGH","22/01/2022","CCA","GPF",20,615);
    m3.show();
    Employee m4("Lokesh","IJK","22/01/2022","CCA","GPF",20,615);
    m4.show();
    Employee m5("Dhruv","LMN","22/01/2022","HRA","GPF",20,615);
    m5.show();
    Employee m6("Rohit","OPK","22/01/2022","DA","PPF",20,615);
    m6.show();

    Employee *n1;
    n1=new Employee;
    n1->show();
    delete n1;
    
}