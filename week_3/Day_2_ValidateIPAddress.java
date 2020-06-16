//  Question Link: https://leetcode.com/explore/featured/card/june-leetcoding-challenge/541/week-3-june-15th-june-21st/3362/
//  Time Complexity: O(n)
//  Space Complexity: O(1)

//  Simple string problem.
public String validIPAddress(String IP) {
    String result = "Neither";
    if (IP.length() == 0 || IP.isBlank())
        return result;
    String[] input;

    if (IP.contains(".")) {
        if (IP.charAt(0) == '.' || IP.charAt(IP.length() - 1) == '.')
            return result;
        input = IP.split("\\.");
        if (input.length != 4)
            return result;
        for (String str : input) {
            if (str.isBlank() || str.length() > 3 || (str.length() > 1 && str.charAt(0) == '0'))
                return result = "Neither";
            for (char ch : str.toCharArray())
                if (ch < '0' || ch > '9')
                    return result = "Neither";
            int classNo = Integer.parseInt(str);
            if (classNo < 0 || classNo > 255)
                return result = "Neither";
        }
        return result = "IPv4";
    }

    if (IP.contains(":")) {
        if (IP.charAt(0) == ':' || IP.charAt(IP.length() - 1) == ':')
            return result = "Neither";
        input = IP.split(":");
        if (input.length != 8)
            return result = "Neither";
        for (String str : input) {
            if (str.isBlank() || str.length() > 4)
                return result = "Neither";
            for (char ch : str.toLowerCase().toCharArray())
                if ((ch < '0' || ch > '9') && ch != 'a' && ch != 'b' && ch != 'c' && ch != 'd' && ch != 'e'
                        && ch != 'f')
                    return result = "Neither";
        }
        return result = "IPv6";
    }

    return result;
}