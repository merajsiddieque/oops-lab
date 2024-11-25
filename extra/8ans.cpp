#include<iostream>
#include<conio.h>
using namespace std;
class book
{

    public:
    string accession_no,author_name,book_title,publisher_name;
    int book_cost,publish_year;
    

    book()
    {
        cout<<"default constructor"<<endl;
    }

    ~ book()
    {
        cout<<"default destructor"<<endl;
    }

    void getData()
    {
        cout << "accession_no,author_name,book_title,publisher_name,book_cost,publish_year"<<endl;
        cin>>accession_no>>author_name>>book_title>>publisher_name>>book_cost>>publish_year;

    }

    void showData()
    {
        cout << "accession_no: "<<accession_no<<endl;
        cout <<"author_name: "<<author_name<<endl;
        cout <<"book_title: "<<book_title<<endl;
        cout <<"publisher_name: "<<publisher_name<<endl;
        cout <<"book_cost: "<<book_cost<<endl;
        cout <<"publish_year: "<<publish_year<<endl;
    }

};

int main()
{
    int n;
     cout<<"Enter no. of books details you want to save: "<<endl;
     cin>>n;
    book b[n];
    for(int i=0; i<n; i++)
    {
        b[i].getData();
    }

    for(int i=0; i<n; i++)
    {
        b[i].showData();
    }
    

   


    return 0;

}