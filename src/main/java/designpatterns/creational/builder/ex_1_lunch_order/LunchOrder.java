package designpatterns.creational.builder.ex_1_lunch_order;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class LunchOrder {
   private String bread;
   private String dressing;
   private String condiments;
   private String meat;
}
