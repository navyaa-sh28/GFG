#include <iostream>
#include <string>
#include <cmath>
using namespace std;

int main() {
    string s;
    int n;
    float f;
    int ff; // To store floor of f

    // Read string (including spaces)
    getline(cin, s);

    // Read integer
    cin >> n;

    // Read float
    cin >> f;

    // Compute floor
    ff = floor(f);

    cout << s << endl;
    cout << n << endl;
    cout << ff << endl;

    return 0;
}