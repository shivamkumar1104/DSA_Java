#include <iostream>
using namespace std;
int main(){
    int m, n;
    cin>>n>>m;
    vector<int> adj[n+1];
    for(int i = 0; i< m; i++){
        int u, v;
        cin>> u>> v;
        // u ----> v
        adj[u].pushback[v];
        // v ----> u
        adj[v].pushbak[u];

 }                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                           
    return 0;
}