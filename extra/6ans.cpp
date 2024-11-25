#include<iostream>
#include<conio.h>
using namespace std;
class marksheet
{

    public:
    string student_name,subj_name;
    double roll,subj_code,Internal_marks,External_marks;
    

    marksheet()
    {
        cout<<"default constructor"<<endl;
    }

    ~ marksheet()
    {
        cout<<"default destructor"<<endl;
    }

    void getData()
    {
        cout << "student_name,subj_name,roll,subj_code,Internal_marks,External_marks;"<<endl;
        cin>>student_name>>subj_name>>roll>>subj_code>>Internal_marks>>External_marks;

    }

    void showData()
    {
        cout << "student_name: "<<student_name<<endl;
        cout <<"subj_name: "<<subj_name<<endl;
        cout <<"roll: "<<roll<<endl;
        cout <<"subj_code: "<<subj_code<<endl;
        cout <<"Internal_marks: "<<Internal_marks<<endl;
        cout <<"External_marks: "<<External_marks<<endl;
    }

};

int main()
{
    int n;
     cout<<"Enter no. of marksheet details you want to save: "<<endl;
     cin>>n;
    marksheet m[n];
    for(int i=0; i<n; i++)
    {
        m[i].getData();
    }

    for(int i=0; i<n; i++)
    {
        m[i].showData();
    }
    

   


    return 0;

}