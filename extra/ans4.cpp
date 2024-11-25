#include<iostream>
#include<conio.h>
using namespace std;
class hospital
{

    private:
    string Name,Sex,NOI,DOA;
    int Age,WardNumber,BedNumber;

    public:

    hospital()
    {
        cout<<"default constructor"<<endl;
    } 
   ~ hospital()
    {
        cout<<"default destructor"<<endl;
    } 
     
     hospital(string Name,string Sex, string NOI, string DOA,int Age,int WardNumber, int BedNumber)
     {
        this->Name=Name;
        this->Age=Age;
        this->BedNumber=BedNumber;
        this->Sex=Sex;
        this->NOI=NOI;
        this->DOA=DOA;
        this->WardNumber=WardNumber;
     }

     void show()
     {
        cout<<"Name=" <<Name;
        cout<<" , Age="<<Age;
        cout<<" , BedNumber="<<BedNumber;
        cout<<" , Sex="<<Sex;
        cout<<" , NOI="<<NOI;
        cout<<" , DOA="<<DOA;
        cout<<" , WardNumber="<<WardNumber<<endl;
     }

     friend class patient;

};

int main()
{
    

    hospital m1("Meraj","M","Fever","22/01/2022",18,20,615);
    m1.show();
    hospital m2("Mihir","M","Fever","22/01/2022",18,20,615);
    m2.show();
    hospital m3("Anshul","M","Fever","22/01/2022",18,20,615);
    m3.show();
    hospital m4("Lokesh","M","Fever","22/01/2022",18,20,615);
    m4.show();
    hospital m5("Dhruv","M","Fever","22/01/2022",18,20,615);
    m5.show();
    hospital m6("Rohit","M","Fever","22/01/2022",18,20,615);
    m6.show();

    hospital *n1;
    n1=new hospital;
    n1->show();
    delete n1;
    
}