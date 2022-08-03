class MyCalendar {
    private final TreeMap<Integer,Integer> map;
    public MyCalendar() {
        map=new TreeMap<>();
    }
    
    public boolean book(int start, int end) {
        Integer lowval=map.lowerKey(end);
        if(lowval==null || map.get(lowval)<=start) {
            map.put(start,end);
            return true;
        }
        return false;
    }
}

/**
 * Your MyCalendar object will be instantiated and called as such:
 * MyCalendar obj = new MyCalendar();
 * boolean param_1 = obj.book(start,end);
 */