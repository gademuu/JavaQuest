package backend;


public interface WordDao {
    
    public Word create(Word aWord);
   
    public Word read(Word aWord);
    
    public void update(Word aWord);
    
    public void delete(Word aWord);
    
    public Word[] find(Word criteria);
}
