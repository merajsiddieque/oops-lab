#include <iostream>
using namespace std;

class Integer {
int a,b;
public:
    
    friend istream& operator >> (istream& in, Integer& A){
    in>>A.a>>A.b;
    return in;
}

    friend ostream& operator<<(ostream& out, Integer& A){
    out<<"Sum of two Integers is : "<<endl;
    out << A.a+A.b;
    return out;
}
};
int main() {
    Integer A;
    cout<<"Enter two integers"<<endl;
    cin>>A;
    cout<<A;

    return 0;
}
