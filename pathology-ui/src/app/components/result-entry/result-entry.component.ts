import { Component } from '@angular/core';
import { CommonModule } from '@angular/common';
import { FormsModule } from '@angular/forms';
import { ApiService } from '../../services/api.service';

@Component({
  selector: 'app-result-entry',
  standalone: true,
  imports: [CommonModule, FormsModule],
  templateUrl: './result-entry.component.html'
})
export class ResultEntryComponent {

  orderId = 1;

  formData = {
    resultValue: '',
    technicianNotes: ''
  };

  constructor(private api: ApiService) {}

  saveResult() {
    this.api.saveResult(this.orderId, this.formData).subscribe(() => {
      alert('Result Saved');
    });
  }
}