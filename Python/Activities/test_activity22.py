import pytest

def add(a, b):
    return a + b

def subtract(a, b):
    return a - b

def multiply(a, b):
    return a * b

def divide(a, b):
    return a / b

#data
def test_sum():
    assert add(10, 10) == 20

def test_difference():
    assert subtract(10, 5) == 5

@pytest.mark.activity
def test_product():
    assert multiply(10, 5) == 50

@pytest.mark.activity
def test_quotient():
    assert divide(10, 2) == 5
