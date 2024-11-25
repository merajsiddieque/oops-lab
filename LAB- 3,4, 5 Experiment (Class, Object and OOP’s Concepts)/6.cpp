#include<iostream>
using namespace std;

class two;
class one
{
    float no1;
    public:
    void get1() 
    {
        cout<<"\n Enter class one value"<<endl;
        cin>>no1;
    }
    friend float mean(one &ob1,two &ob2);
};
class two
{
float no2;
    public:
    void get2() 
    {
         cout<<"\n Enter class two value"<<endl;
        cin>>no2;
    }
    friend float mean(one &ob1,two &ob2);
};

float mean(one &ob1, two &ob2)
{
     cout<<"The mean value is : "<<((ob1.no1+ob2.no2)/2)<<endl;
}

int main()
{
    one ob1;
    two ob2;
    ob1.get1(); 
    ob2.get2(); 
    mean(ob1,ob2);
    
}