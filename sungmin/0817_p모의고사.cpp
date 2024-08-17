#include <string>
#include <vector>

using namespace std;

vector<int> solution(vector<int> answers) {
    vector<int> answer;
    vector<int> a1 = {1, 2, 3, 4, 5};
    vector<int> a2 = {2, 1, 2, 3, 2, 4, 2, 5};
    vector<int> a3 = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};
    int a1a = 0, a2a = 0, a3a = 0;

    for (int i = 0; i < answers.size(); i++) {
        if (answers[i] == a1[i % 5]) {
            a1a++;
        }
        if (answers[i] == a2[i % 8]) {
            a2a++;
        }
        if (answers[i] == a3[i % 10]) {
            a3a++;
        }
    }

    int max_score = max(max(a1a, a2a), a3a);
    if (max_score == a1a) answer.push_back(1);
    if (max_score == a2a) answer.push_back(2);
    if (max_score == a3a) answer.push_back(3);

    return answer;
}
