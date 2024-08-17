#include <string>
#include <vector>
#include <algorithm>

using namespace std;

vector<int> solution(vector<string> name, vector<int> yearning, vector<vector<string>> photo) {
    vector<int> answer;
    for(int i=0;i<photo.size();i++)
    {
        int sum=0;
        for(int j=0;j<name.size();j++)
        {
            if(find(photo[i].begin(),photo[i].end(),name[j])!=photo[i].end())
            {
                sum+=yearning[j];
            }
        }
        answer.push_back(sum);
    }
    return answer;
}
