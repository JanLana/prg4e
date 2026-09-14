int znncz(int* values, const unsigned int size) {
    int min = -10000; int max = 10000;
    for(int i = 0; i < size; i++) {
        if(values[i] < min) min = values[i];
        if(values[i] > max) max = values[i];
    }

    int offset = -min;
    int inv[1024];
    for(int i = 0; i < 1023; i++) inv[i] = 0;
    
    //TODO
}

int main() {
    int values[] = {
        -1, -1, -1, -1, -1, 0, 1, 2, 2, 3, 3, 3, 4, 5, 6, 7
    };

    return znncz(values, sizeof(values));
}