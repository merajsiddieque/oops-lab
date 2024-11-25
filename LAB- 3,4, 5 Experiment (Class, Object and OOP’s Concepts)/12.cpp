#include<iostream>
using namespace std;
class str{
    private:
    string a;
    public:
    void gets()
    {
        cout<<"Enter any string : ";
        cin>>a;
    }

    friend bool operator ==(str const&x,str const&y)
    {
        return x.a == y.a;
    }
};

int main(){
     str s,t;
     s.gets();
     t.gets();
     if (s == t){
        cout<<"Given inputs are equal";
     }
     else{
        cout<<"Given inputs are not equal";
     }
}