#include<iostream>
using namespace std;
class Integer{
    private:
    int x;
    public:
    void getx()
    {
        cout<<"Enter the Integer:";
        cin>>x;
    }

    friend void operator + (Integer const&A,Integer const&B)
    {
     cout<<"Addition of 2 integers: "<<A.x+B.x<<endl;
    }
};

int main(){
  Integer x,y;
  x.getx();
  y.getx();
  x+y;
}
