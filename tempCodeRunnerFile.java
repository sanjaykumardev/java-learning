
        int weight = 0;
        while (n > 0) {
            weight += n % 10;
            n /= 10;
        }
        return weight;