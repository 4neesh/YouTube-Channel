import { Component, OnDestroy, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { Subscription } from 'rxjs';
import { DiaryEntry } from '../shared/dairy-entry.model';
import { DiaryDataService } from '../shared/diary-data.component';

@Component({
  selector: 'app-diary',
  templateUrl: './diary.component.html',
  styleUrls: ['./diary.component.css']
})
export class DiaryComponent implements OnInit, OnDestroy {

  constructor(private diaryDataService: DiaryDataService, private router: Router) { }
  
  ngOnDestroy(): void {
    this.diaryEntriesSub.unsubscribe();
  }

  diaryEntries: DiaryEntry[] = [];
  diaryEntriesSub = new Subscription();

  ngOnInit(): void {
    this.diaryDataService.getDiaryEntries();
    this.diaryEntriesSub = this.diaryDataService.diarySubject.subscribe(entries => {
      this.diaryEntries = entries;
    })
  }

  onDelete(id: string){
    this.diaryDataService.onDeleteEntry(id);
  }

  onEdit(id: string){
    this.router.navigate(['edit',id])
  }
}
