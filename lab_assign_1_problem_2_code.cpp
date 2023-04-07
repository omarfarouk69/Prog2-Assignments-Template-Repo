/*omar mohamed farouk*/
#include <iostream>

using namespace std;

int main()
{
    float x , y;
    cout<<"enter coordiantions";
    cin>>x>>y;
    if (x>0 && y>0)
    {
        cout<<"ur in first quad";
    }
    else if (x<0 && y>0)
    {
        cout<<"ur in second quad";
    }
    else if (x<0 && y<0)
    {
        cout<<"ur in third quad";
    }
    else 
        cout<<"ur in fourth quad";
    
    
    
    return 0 ;
}
