#include<iostream>
using namespace std;

class tax
{
  public:
  string name,accType;
  double AccNo,BalanceAmount=0,deposit,withdraw;


  
  void getData()
  {
    cout<<"Enter Account Holder Name: "<<endl;
    cin>>name;
    cout<<"Enter Account Type : "<<endl;
    cin>>accType;
    cout<<"Enter Account Number : "<<endl;
    cin>>AccNo;
  }

  void deposit()
  {
    cout<<"Enter Amount you want to deposit"<<endl;
    cin>>deposit;
    BalanceAmount=BalanceAmount+deposit;
  }
  void withdraw()
  {
    cout<<"Enter Amount you want to withdraw"<<endl;
    cin>>withdraw;
    BalanceAmount=BalanceAmount-withdraw;
  }

  void ComputeTax()
  {
    if(income==100000 )
    {
        totaltax=0;
    }
    else if (income>100000 && income<=150000)
    {
        totaltax=income*0.1;
    }
    else if (income>151000 && income<=200000)
    {
        totaltax=income*0.2;
    }
    else if (income>200000)
    {
        totaltax=income*0.3;
    }
   
    else{
        cout<<"Invalid data"<<endl;
    }
  }
  void ShowData()
  {
    cout<<"Your name: "<<name<<endl;
    cout<<"Your Income: "<<income<<endl;
    cout<<"Total tax due: Rs."<<totaltax<<endl;
  }

};

int main ()
{
    int n;
    cout<<"Enter No of tax payee: "<<endl;
    cin>>n;
    tax t[n];
    for(int i=0; i<n; i++)
    {
        t[i].getData();
        t[i].ComputeTax();
        t[i].ShowData();
    }

    return 0;
}