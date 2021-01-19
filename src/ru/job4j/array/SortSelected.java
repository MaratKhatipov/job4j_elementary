package ru.job4j.array;

public class SortSelected {
	public static int[] sort(int[] data) {	//data - массив чисел, который нужно отсортировать по возрастанию.
		for (int i = 0; i < data.length; i++) {
			int min = MinDiapason.findMin(data, i, data.length);
			int index = FindLoop.indexOf(data, min, i, data.length);
			if (data[i] > data[index]) {
				int tmp = data[i];
				data[i] = data[index];
				data[index] = tmp;
			}
		}
		return data;
	}
}
