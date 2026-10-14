// class Solution {
//     public String maxSumOfSquares(int num, int sum) {
//         StringBuilder sb = new StringBuilder();

//         while (sum >= 9) {
//             sb.append('9');
//             sum -= 9;
//             num--;
//         }

//         if (sum > 0) {
//             sb.append(sum);
//             num--;
//         }

//         while (num > 0) {
//             sb.append('0');
//             num--;
//         }

//         return sb.toString();
//     }
// }

class Solution {
    public String maxSumOfSquares(int num, int sum) {
        if (sum > 9 * num) return "";

        int nines = sum / 9;
        int remain = sum % 9;

        StringBuilder result = new StringBuilder();

        result.append("9".repeat(nines));

        if (remain > 0) {
            result.append((char) (remain + '0'));
        }

        result.append("0".repeat(num - result.length()));

        return result.toString();
    }
}