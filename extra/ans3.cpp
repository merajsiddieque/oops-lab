#include<iostream>
#include<conio.h>
using namespace std;
class employee
{

    public:
    string emp_name,designation;
    double emp_code,yearOfExp,age;
    int d1,d2,d3,d4;
    

    employee()
    {
        cout<<"default constructor"<<endl;
    }

    ~ employee()
    {
        cout<<"default destructor"<<endl;
    }

    void getData()
    {
        cout << "emp_name,emp_code,designation,yearOfExp,age"<<endl;
        cin>>emp_name>>emp_code>>designation>>yearOfExp>>age;

    }

    // void showData()
    // {
    //     cout << "emp_name: "<<emp_name<<endl;
    //     cout <<"emp_code: "<<emp_code<<endl;
    //     cout <<"designation: "<<designation<<endl;
    //     cout <<"yearOfExp: "<<yearOfExp<<endl;
    //     cout <<"age: "<<age<<endl;
    // }

    employee(int d1,int d2, int d3, int d4)
    {
        this->d1=d1;
        this->d2=d2;
        this->d3=d3;
        this->d4=d4;
    }

    void parametData()
    {
        cout<<"sum of 4 data"<<d1+d2+d3+d4<<endl;
    }

};

int main()
{
    // int n;
    //  cout<<"Enter no. of employee details you want to save: "<<endl;
    //  cin>>n;
     employee em1(20,30,40,60);
     em1.parametData();
     employee em2(em1);
     em2.parametData();

     employee *emp1 =new employee;
     emp1->getData();
    //  emp1->showData();

     delete emp1;

    // employee e[n];
    // for(int i=0; i<n; i++)
    // {
    //     e[i].getData();
    // }

    // for(int i=0; i<n; i++)
    // {
    //     e[i].showData();
    // }
    

   


    return 0;

}