class Solution:
    def findAnagrams(self, s: str, p: str) -> List[int]:
        if not p or not s:
            return []
        # build freq map
        freq = defaultdict(int)
        for c in p:
            freq[c] += 1
        st = 0
        matched = 0
        res = []
        for ed in range(len(s)):
            rightchar = s[ed]
            if rightchar in freq:
                freq[rightchar] -= 1
                if freq[rightchar] == 0:
                    matched += 1
            if ed-st+1 > len(p):
                leftchar = s[st]
                if leftchar in freq:
                    if freq[leftchar] == 0:
                        matched -= 1
                    freq[leftchar] += 1
                st += 1
            if matched == len(freq):
                res.append(st)
        return res
  