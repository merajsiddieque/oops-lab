#include<iostream>
#include<conio.h>
using namespace std;
class Employee
{
    string name;
    float earning, bonus;
   public:

    void getData()
    {
    cout<<"Enter the Name of Employee: "<<endl;
    cin>>name;
    cout<<"Enter the earings of Employee: "<<endl;
    cin>>earning;
    }


   void computeBonus()
   {
    if (earning>=2000)
    {
      bonus=earning+(earning*10/100);
    }
    else
     {
     bonus=earning;
     }
   }

   void showOutput()
   {
     cout<<"The name of Employee: "<<name<<endl;
     cout<<"The total earnings of Employee: "<<bonus;
   }
  

};

int main()
{
    Employee e1;
    e1.getData();
    e1.computeBonus();
    e1.showOutput();
    return 0;
}