#include<iostream>
#include<conio.h>
using namespace std;
class Book
{

    private:
    string AName,PName,TitleOfTheBook,YearOfPublication;
    int CostOfTheBook,AccessionNumber;

    public:

    Book()
    {
        cout<<"default constructor"<<endl;
    } 
   ~ Book()
    {
        cout<<"default destructor"<<endl;
    } 
     
     Book(string AName,string PName, string TitleOfTheBook, string YearOfPublication,int CostOfTheBook,int AccessionNumber)
     {
        this->AName=AName;
        this->PName=PName;
        this->TitleOfTheBook=TitleOfTheBook;
        this->YearOfPublication=YearOfPublication;
        this->CostOfTheBook=CostOfTheBook;
        this->AccessionNumber=AccessionNumber;
     }

     void show()
     {
        cout<<"Author's Name=" <<AName;
        cout<<" , Publisher's Name ="<<PName;
        cout<<" , TitleOfTheBook="<<TitleOfTheBook;
        cout<<" , YearOfPublication="<<YearOfPublication;
        cout<<" , CostOfTheBook="<<CostOfTheBook;
        cout<<" , AccessionNumber="<<AccessionNumber<<endl;
     }

};

int main()
{
    string AName,PName,TitleOfTheBook,YearOfPublication;
    int CostOfTheBook,AccessionNumber;
    

    // Book m1("Meraj","Mihir","fairytales","22/01/2022",2000,6157);
    // m1.show();
    // Book m2("Meraj","Anshul","fairytales","22/01/2022",2000,6157);
    // m2.show();
    // Book m3("Meraj","shivam","fairytales","22/01/2022",2000,615978);
    // m3.show();
    // Book m4("Meraj","rohit","fairytales","22/01/2022",2000,61596);
    // m4.show();
    //  Book m5("Meraj","shubham","fairytales","22/01/2022",2000,6155);
    // m5.show();
    //  Book m6("Meraj","setty","fairytales","22/01/2022",2000,6151);
    // m6.show();
    int n;

    cout<<"Enter no of books record"<<endl;
    cin>>n;

    for(int i=0; i<n; i++)
    {
        Book *n[n];
        n[i]=new Book;
         cout<<"Author's Name=" <<endl;
         cin>>AName;
        cout<<" , Publisher's Name ="<<endl;
        cin>>PName;
        cout<<" , TitleOfTheBook="<<endl;
        cin>>TitleOfTheBook;
        cout<<" , YearOfPublication="<<endl;
        cin>>YearOfPublication;
        cout<<" , CostOfTheBook="<<endl;
        cin>>CostOfTheBook;
        cout<<" , AccessionNumber="<<endl;
        cin>>AccessionNumber;
        n[i](AName, PName, TitleOfTheBook, YearOfPublication,CostOfTheBook,AccessionNumber);
        n[i]->show();
        delete n[i];
    }
   
    
}