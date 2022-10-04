class Solution {

public:
    vector<int> nextGreaterElements(vector<int>& nums) {
        
        int size1 = nums.size() , i , max_num = INT_MIN , j;
        vector<int> v;
        for( i = 0 ; i < size1 ; i++ )
        {
            if( max_num < nums[i] )
                max_num = nums[i];
        }
        for( i = 0 ; i < size1 ; i++ )
        {
            for( j = i + 1 ; j < size1 ; j++ )
            {
                if( nums[j] > nums[i] )
                {
                    v.push_back( nums[j] );
                    break;
                }
            }
            if( j == size1 )
            {
                for( j = 0 ; j < i ; j++ )
                {
                    if( nums[j] > nums[i] )
                    {
                        v.push_back( nums[j] );
                        break;
                    }
                }
                if( j == i )
                    v.push_back(-1);
            }
        }
        return v;
    }
};