package shape;

import java.util.List;

public class SortingTechnique {
	
	public static void bubbleSort(List<Shape> shapes) {
		int length = shapes.size();
		
		for (int i = 0; i < length - 1; i++) {
			for (int j = 0; j < length - i - 1; j++)  {
				if (shapes.get(j).getArea() > shapes.get(j + 1).getArea()) {
					Shape temp = shapes.get(j);
					int tempX = shapes.get(j + 1).getUpperX();
					int tempY = shapes.get(j + 1).getUpperY();
					shapes.set(j, shapes.get(j + 1));
					shapes.get(j).setUpperX(temp.getUpperX());
					shapes.get(j).setUpperY(temp.getUpperY());
					shapes.set(j + 1, temp);
					shapes.get(j + 1).setUpperX(tempX);
					shapes.get(j + 1).setUpperY(tempY);
				}
			}
		}
	}
}
