[![Review Assignment Due Date](https://classroom.github.com/assets/deadline-readme-button-22041afd0340ce965d47ae6ef1cefeee28c7c493a6346c4f15d667ab976d596c.svg)](https://classroom.github.com/a/0TIkZLFr)
	  int number = Integer.parseInt(startingNumber);
	  int seed = 1;
	  
	  for(int i = 1; i < number; i++) {
		  if(seed % 2 == 0) {
			seed /= 2;
			  System.out.println(seed);
		  }else{
			  seed = 3 * seed + 1;
			  System.out.println(seed);