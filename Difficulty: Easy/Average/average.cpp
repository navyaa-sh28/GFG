int posAverage(int arr[], int size) {
    int sum = 0, num = 0;

    for(int i = 0; i < size; i++){
        if(arr[i] >= 0){   // include 0
            sum += arr[i];
            num++;
        }
    }

    if(num == 0) return 0;

    return sum / num;
}