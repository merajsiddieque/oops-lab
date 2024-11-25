#include<iostream>
using namespace std;

class teleBill
{
  public:
  string name;
  float noc,bAmount=200,billAmount;

  void getData()
  {
    cout<<"Enter name: "<<endl;
    cin>>name;
    cout<<"Enter Number of Calls : "<<endl;
    cin>>noc;
  }

  void ComputeBill()
  {
    if(noc<=100 )
    {
        billAmount=noc*200;
    }
    else if (noc>100 && noc<=150)
    {
        billAmount=bAmount+((noc-100)*0.60);
    }
    else if (noc>150 && noc<=200)
    {
        billAmount=bAmount+((noc-150)*50)+(0.60*50);
    }
    else if (noc>200)
    {
        billAmount=bAmount+(0.50*50)+(0.60*50)+((noc-150)*0.40);
    }
    else{
        cout<<"Invalid data"<<endl;
    }
  }
  void ShowData()
  {
    cout<<"Your name: "<<name<<endl;
    cout<<"Your No of Calls: "<<noc<<endl;
    cout<<"Total Bills of Telephone Cost: Rs."<<billAmount<<endl;
  }

};

int main ()
{
    int n;
    cout<<"Enter No of Customers: "<<endl;
    cin>>n;
    teleBill t[n];
    for(int i=0; i<n; i++)
    {
        t[i].getData();
        t[i].ComputeBill();
        t[i].ShowData();
    }

    return 0;
}