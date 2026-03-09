class StableExample {
    public static void main(String[] args) {
        int value[] = {4, 2, 4, 1};
        char label[] = {'A', 'B', 'C', 'D'};

        for (int i = 1; i < value.length; i++) {
            int key = value[i];
            char keyLabel = label[i];
            int j = i - 1;

            while (j >= 0 && value[j] > key) {
                value[j + 1] = value[j];
                label[j + 1] = label[j];
                j--;
            }

            value[j + 1] = key;
            label[j + 1] = keyLabel;
        }

        for (int i = 0; i < value.length; i++) {
            System.out.println(value[i] + " " + label[i]);
        }
    }
}