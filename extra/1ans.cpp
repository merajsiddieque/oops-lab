#include<iostream>
#include<conio.h>
using namespace std;
class person
{

    private:
    int salary;

    public:
    int data1,data2,data3;

    person()
    {
        cout<<"default constructor"<<endl;
    }

    ~ person()
    {
        cout<<"default destructor"<<endl;
    }

    person(int data1,int data2, int data3)
    {
        this->data1=data1;
        this->data2=data2;
        this->data3=data3;
    }

    // void getData()
    // {
    //     cout << "Enter D1, D2, D3"<<endl;
    //     cin>>data1>>data2>>data3;

    // }

    void showData()
    {
        cout<<"salary of 3 data  "<<data1+data2+data3<<endl;
    }

};

int main()
{
    person p1(20,30,40);
    person p2(p1);
    // p1.showData();
    p2.showData();
    

   


    return 0;

}