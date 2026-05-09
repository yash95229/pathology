import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { environment } from '../../environments/environment';

@Injectable({
  providedIn: 'root'
})
export class ApiService {

  private baseUrl = environment.apiUrl;

  constructor(private http: HttpClient) {}

  getTests() {
    return this.http.get(`${this.baseUrl}/tests`);
  }

  createTest(data: any) {
    return this.http.post(`${this.baseUrl}/tests`, data);
  }

  createOrder(data: any) {
    return this.http.post(`${this.baseUrl}/orders`, data);
  }

  getTodayOrders() {
    return this.http.get(`${this.baseUrl}/orders/today`);
  }

  saveResult(orderId: number, data: any) {
    return this.http.post(`${this.baseUrl}/results/${orderId}`, data);
  }
}