#include<iostream>
using namespace std;

class cuboid
{
    float l,b,h;
    float small;
    public:
    void get() 
    {
        cout<<"\n Enter lenth breadth and height"<<endl;
        cin>>l>>b>>h;
    }

    void showcouboid()
    {
        cout<<"Voumne of cuboid : "<<l*b*h<<endl;
    }

    void smallest()
    {
    if(l<b && l<h)
    {
        small=l;
    }
    else if(b<h && b<l)
    {
        small=b;
    }
    else{
        small=h;
    }

    }
    friend float cube(cuboid &cub);
};
float cube(cuboid &cub)
{
     cout<<"The cube of cuboid : "<<cub.small*cub.small*cub.small<<endl;
}

int main()
{
    cuboid cub;

    cub.get();
    cub.showcouboid();
    cub.smallest();
    cube(cub);
    
}