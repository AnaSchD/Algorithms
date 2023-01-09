package skypro.com.algorithms;

import skypro.com.algorithms.exception.ElementNotFoundException;
import skypro.com.algorithms.exception.InvalidIndexException;
import skypro.com.algorithms.exception.NullItemException;
import skypro.com.algorithms.exception.RepositoryIsFullException;

import java.util.Arrays;

public class StringListImpl implements StringList {

    private final String[] repository;
    private int size;

    public StringListImpl() {
        repository = new String[10];
    }

    public StringListImpl(int initSize) {
        repository = new String[initSize];
    }


    @Override
    public String add(String item) {
        validateSize();
        validateItem(item);

        repository[size++] = item;
        return item;
    }

    @Override
    public String add(int index, String item) {
        validateItem(item);
        validateSize();
        validateIndex(index);

        if (index == size) {
            repository[size++] = item;
            return item;
        }

        System.arraycopy(repository, index, repository, index + 1, size - index);
        repository[index] = item;
        return item;
    }

    @Override
    public String set(int index, String item) {
        validateIndex(index);
        validateItem(item);
        repository[index] = item;
        return item;
    }

    @Override
    public String remove(String item) {
        validateItem(item);

        int index = indexOf(item);
       return remove(index);
    }

    @Override
    public String remove(int index) {
        validateIndex(index);

        String item = repository[index];

        if (index != size) {
            System.arraycopy(repository, index + 1, repository, index, size - index);
        }
        size--;
        return item;
    }

    @Override
    public boolean contains(String item) {
        return indexOf(item) != -1;
    }

    @Override
    public int indexOf(String item) {

        for (int i = 0; i < size; i++) {
            String rep = repository[i];
            if (rep.equals(item)) {
                return i;
            }
        }
        return -1;
    }

    @Override
    public int lastIndexOf(String item) {
        for (int i = size - 1; i >= 0; i--) {
            String rep = repository[i];
            if (rep.equals(item)) {
                return i;
            }
        }
        return -1;
    }

    @Override
    public String get(int index) {
        validateIndex(index);
        return repository[index];
    }

    @Override
    public boolean equals(StringList otherList) {
        return Arrays.equals(this.toArray(), otherList.toArray());
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public void clear() {
        size = 0;
    }

    @Override
    public String[] toArray() {
        return Arrays.copyOf(repository, size);
    }

    private void validateItem(String item) {
        if (item == null) {
            throw new NullItemException();
        }
    }

    private void validateSize() {
        if (size == repository.length) {
            throw new RepositoryIsFullException();
        }
    }

    private void validateIndex(int index) {
        if (index < 0 || index > size) {
            throw new InvalidIndexException();
        }
    }
}
