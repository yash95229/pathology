import { Component } from '@angular/core';
import { CommonModule } from '@angular/common';
import { FormsModule } from '@angular/forms';
import { ApiService } from '../../services/api.service';

@Component({
  selector: 'app-test-order',
  standalone: true,
  imports: [CommonModule, FormsModule],
  templateUrl: './test-order.component.html'
})
export class TestOrderComponent {

  formData = {
    patientName: '',
    phone: '',
    testId: 1
  };

  orders: any[] = [];

  constructor(private api: ApiService) {
    this.loadOrders();
  }

  loadOrders() {
    this.api.getTodayOrders().subscribe((res: any) => {
      this.orders = res;
    });
  }

  saveOrder() {
    this.api.createOrder(this.formData).subscribe(() => {
      this.loadOrders();
    });
  }
}