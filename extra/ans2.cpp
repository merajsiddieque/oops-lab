#include<iostream>
#include<conio.h>
using namespace std;
class ans2
{
   public:
    ans2()
   {
    cout<<"Default constructor"<<endl;
   }
  ~ ans2()
   {
    cout<<"Default destructor"<<endl;
   }

   void show(string A)
   {
       cout<<"string"<<A<<endl;
   }

};

int main()
{
    string A="concatenate";
    ans2 a(A);
    a.show();
    // Alphabet b(a);
    return 0;
}