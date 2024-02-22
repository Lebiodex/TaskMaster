import java.time.LocalTime;
public class Task {

   private String title;
   private String category;
   private int priority;
   private LocalTime deadline;

   public Task(String title, String category, int priority, LocalTime deadline){

      this.title=title;
      this.category=category;
      this.priority=priority;
      this.deadline=deadline;

   }

   public Task() {

   }

   public String getTitle() {
      return title;
   }
   public String getCategory() {
      return category;
   }
   public int getPriority() {
      return priority;
   }
   public LocalTime getDeadline() {
      return deadline;
   }
}